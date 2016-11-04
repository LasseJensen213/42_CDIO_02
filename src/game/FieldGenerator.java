package game;

import java.awt.Color;

import desktop_fields.Field;
import desktop_fields.Tax;
import desktop_resources.GUI;
import stringBanks.Fields_StringBank;

public class FieldGenerator{

	//Information regarding the fields:
	private int fieldsInUse[] = {3,5,7,13,15,17,23,25,27,33,35,37};
	private String fieldeffects[] = {"","+250","-100","+100","-20","+180","0","-70","+60","-80","-50","+650"};
	private int nFields = 40;

	//Information arrays for the fields:
	Color[] bgColors = new Color[40];
	Color fgColors[] = new Color[40];

	String[] fieldnames = new String[40];
	String[] fielddescriptions = new String[40];
	String[] fieldEffect = new String[40];

	public void initbgColors() 
	{
		for(int i = 0;i<40;i++){
			bgColors[i] = Color.BLACK;
			for(int r = 0;r<12;r++) 
			{
				if ( i==fieldsInUse[r]) 
				{
					bgColors[i] = Color.BLUE;
				}		

			}

		}
	}

	public void initfgColors() 
	{
		for(int i = 0;i<40;i++){
			fgColors[i] = Color.BLACK;
			for(int r = 0;r<12;r++) 
			{
				if ( i==fieldsInUse[r]) 
				{
					bgColors[i] = Color.YELLOW;
				}		

			}

		}
	}

	public void initfieldnames()
	{
		int nrReached = 0;
		for(int i = 0;i<40;i++){
			fieldnames[i] = "";
			for(int r = 0;r<12;r++) 
			{
				if ( i==fieldsInUse[r]) 
				{
					fieldnames[i]=Fields_StringBank.getFieldNames(nrReached);
					nrReached++;
				}		

			}
		}
	}

	public void initfieldeffect() 
	{
		int NrReached = 0;
		for(int i = 0;i<40;i++)
		{
			fieldEffect[i] = "";
			for(int r = 0;r<12;r++) 
			{
				if ( i==fieldsInUse[r]) 
				{
					fieldEffect[i] = fieldeffects[NrReached];
					NrReached++;		
				}		

			}

		}
	}

	public void initfielddescription()
	{
		int NrReached = 0;
		for(int i = 0;i<40;i++)
		{
			fielddescriptions[i] = "";
			for(int r = 0;r<12;r++) 
			{
				if ( i==fieldsInUse[r]) 
				{
					fielddescriptions[i] = Fields_StringBank.getFieldDescriptions(NrReached);
					NrReached++;		
				}		

			}

		}
	}

	public void makeFields() 
	{
		initbgColors();
		initfgColors();
		initfieldnames();
		initfieldeffect();
		initfielddescription();
		Field[] fields = new Field[nFields];

		for (int i = 0; i<nFields;i++)
		{
			fields[i]= new Tax.Builder().setTitle(fieldnames[i]).setDescription(String.valueOf(fieldEffect[i])).
					setSubText(fielddescriptions[i]).setBgColor(bgColors[i]).setFgColor(fgColors[i]).build();
		}
		GUI.create(fields);
	}



}

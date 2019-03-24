package es.unileon.prg.date;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date()
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}

	public Date(int day, int month, int year) throws DateException
	{
		if(this.day<=0)
		{
			throw new DateException("El dia introducido es incorrecto, un mes no puede tener dias negativos.");
		}
		else if(this.month<=0)
		{
			throw new DateException("El mes introducido es incorrecto, un año no puede tener meses negativos.");
		}
		else if(this.month>12)
		{
			throw new DateException("El mes introducido es incorrecto, un año no puede tener mas de 12 meses.");
		}
		else if(this.year<0)
		{
			throw new DateException("El año introducido es incorrecto.");
		}
		else
		{
			if(this.day>this.daysOfMonth(month))
			{
				throw new DateException("El valor de dia y mes introducidos es incorrecto.");
			}
		}
	}

	public int daysOfMonth(int month)
	{
		int numDias=0;
		
		switch(this.month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				numDias=31;
			break;
		
			case 4:
			case 6:
			case 9:
			case 11:
				numDias=30;
			break;
	
			case 2:
				numDias=28;
			break;	
		}

		return numDias;
	}

	public int getDay()
	{
		return this.day;
	}

	public void setDay(int newDay)
	{
		day=newDay;
	}

	public int getMonth()
	{
		return this.month;
	}

	public void setMonth(int newMonth)
	{
		month=newMonth;
	}

	public int getYear()
	{
		return this.year;
	}

	public void setYear(int newYear)
	{
		year=newYear;
	}

	boolean isSameDay(Date another)
	{
		this.day=another.getDay();
		return true;
	}

	boolean ifIsSameDay(Date another)
	{
		if(this.day==another.getDay())
		{
			return true;
		}
		return false;
	}

	boolean isSameMonth(Date another)
	{
		this.month=another.getMonth();
		return true;
	}

	boolean ifIsSameMonth(Date another)
	{
		if(this.month==another.getMonth())
		{
			return true;
		}
		return false;
	}

	boolean isSameYear(Date another)
	{
		this.year=another.getYear();
		return true;
	}

	boolean ifIsSameYear(Date another)
	{
		if(this.year==another.getYear())
		{
			return true;
		}
		return false;
	}

	boolean isSame(Date another)
	{
		this.day=another.getDay();
		this.month=another.getMonth();
		this.year=another.getYear();
		return true;
	}

	boolean ifIsSame(Date another)	
	{	if((this.day==another.getDay())&&(this.month==another.getMonth())&&(this.year==another.getYear()))
		{
			return true;
		}
		return false;
	}

	public String monthName()
	{
		String month=null;
		switch(this.month)
		{
			case 1:
				month="Enero.";
				System.out.println("El mes es enero.");
			break;

			case 2:
				month="Febrero.";
				System.out.println("El mes es febrero.");
			break;

			case 3:
				month="Marzo.";
				System.out.println("El mes es marzo.");
			break;

			case 4:
				month="Abril.";
				System.out.println("El mes es abril.");
			break;

			case 5:
				month="Mayo.";
				System.out.println("El mes es mayo.");
			break;

			case 6:
				month="Junio.";
				System.out.println("El mes es junio.");
			break;

			case 7:
				month="Julio.";
				System.out.println("El mes es julio.");
			break;

			case 8:
				month="Agosto.";
				System.out.println("El mes es agosto.");
			break;

			case 9:
				month="Septiembre.";
				System.out.println("El mes es septiembre.");
			break;

			case 10:
				month="Octubre.";
				System.out.println("El mes es octubre.");
			break;

			case 11:
				month="Noviembre.";
				System.out.println("El mes es noviembre.");
			break;

			case 12:
				month="Diciembre.";
				System.out.println("El mes es diciembre.");
			break;
		}

		return month;
	}

	public boolean isDayRight(int day)
	{
		return (this.day>0)&&(day<=this.daysOfMonth(this.month));
	}

	public String seasonMonths()
	{
		String season=null;
		switch(this.month)
		{
			case 1:
			case 2:
			case 3:
				season="Invierno.";
			break;

			case 4:
			case 5:
			case 6:
				season="Primavera.";
			break;
		
			case 7:
			case 8:
			case 9:
				season="Verano.";
			break;

			case 10:
			case 11:
			case 12:
				season="Otoño.";
			break;
		}
		
		return season;
	}

	public String monthsLeft()
	{
		int i;
		StringBuffer monthsLeft=new StringBuffer();
		for(i=this.month+1;i<=12;i++)
		{
			monthsLeft.append(this.monthName()+"\n");
		}
		
		return monthsLeft.toString();
	}

	public int date()
	{
		return this.day+this.month+this.year;
	}

	public String dateLeft() throws DateException
	{
		int i;
		Date adate=new Date(this.day,this.month,this.year);
		StringBuffer salida=new StringBuffer();
		System.out.println("Las fechas restantes hasta el final de año son: \n");

		if((adate.getMonth()==1)||(adate.getMonth()==3)||(adate.getMonth()==5)||(adate.getMonth()==7)||(adate.getMonth()==8)||(adate.getMonth()==10)||(adate.getMonth()==12))
		{
			for(i=adate.getDay()+1;i<=31;i++)
			{
				salida.append(adate.toString()+" ");
			}
		}
		else if((adate.getMonth()==4)||(adate.getMonth()==6)||(adate.getMonth()==9)||(adate.getMonth()==11))
		{
			for(i=adate.getDay()+1;i<=30;i++)
			{
				salida.append(adate.toString()+" ");
			}
		}
		else
		{
			for(i=adate.getDay()+1;i<=28;i++)
			{
				salida.append(adate.toString()+" ");
			}
		}

		return salida.toString();
	}

	public String monthsSameDays()
	{
		switch(this.month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Los meses con los mismos dias al mes introducido son: Enero, marzo, mayo, julio, agosto, octubre y diciembre.");
			break;
	
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Los meses con los mismos dias al mes introducido son: Abril, junio, septiembre y noviembre.");
			break;
		}
	}}

	public int daysSinceJan()
	{
		int count=0, i;
		for(i=1;i<this.month;i++)	
		{
			if((i==1)||(i==3)||(i==5)||(i==7)||(i==8)||(i==10)||(i==12))
			{
				count=count+31;
			}
			else if(i==2)
			{
				count=count+28;
			}
			else
			{
				count=count+30;
			}
		}
		
		count=count+this.day;
		return count-1;
	}

	public int attempsDoWhile() throws DateException
	{
		int attemps=0, aDay, aMonth, aYear;
		do
		{
			aMonth=(int)(Math.random()*12)+1;
			aDay=(int)(Math.random()*this.daysOfMonth(aMonth))+1;
			aYear=this.year;
			attemps++;
		}while(this.isSame(new Date(aDay,aMonth,aYear)));
		return attemps;
	}

	public int attempsWhile()
	{
		int aDay, aMonth, aYear,attemps=0;
		boolean success=false;
		while(success=false)
		{
			aMonth=(int)(Math.random()*12)+1;
			aDay=(int)(Math.random()*this.daysOfMonth(aMonth))+1;
			aYear=this.year;
			attemps++;
		
			if((aDay==this.day)&&(aMonth==this.month))
			{
				success=true;
			}
		}		
		
		return attemps;
	}

	public String daysWeek()
	{
		String day=null;
		switch(this.daysSinceJan()%7)
		{
			case 1:
				day="Lunes.";
			break;

			case 2:
				day="Martes.";
			break;

			case 3:
				day="Miercoles.";
			break;

			case 4:
				day="Jueves.";
			break;

			case 5:
				day="Viernes.";
			break;

			case 6:
				day="Sabado.";
			break;

			case 7:
				day="Domingo.";
			break;
		}
		return day;
	}
}

package es.unileon.prg.date;
/*
 * Clase que representa una fecha.
 *
 * @author Sergio del Ser
 * @Version 4.0
 */
public class Date {
	/*
	 * Día de la fecha.
	 */
	private int day;

	/*
	 * Mes de la fecha.
	 */
	private int month;

	/*
	 * Año de la fecha.
	 */
	private int year;

	/*
	 * Constructor de la clase. Crea una fecha con el día, mes y año.
	 */
	public Date()
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	/*
	 * Constructor de la clase. Crea una fecha con las dimensiones introducidad. Con las 		 * excepciones de los días y meses.
	 *
	 * @param day
	 *	Día de la fecha.
	 *
	 * @param month
	 *	Mes de la fecha.
	 *
	 * @param year
	 *	Año de la fecha.
	 *
	 */
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

	/*
	 *Se clasifican los meses del año según el número de días que tiene.
	 *
	 *@param month
	 *
	 */
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

	//Devuelve el dia de la fecha introducida.
	public int getDay()
	{
		return this.day;
	}

	/*
	 * Modifica el día de la fecha.
	 *
	 * @param newDay
	 *	Día de la nueva fecha.
	 *
	 */
	public void setDay(int newDay)
	{
		day=newDay;
	}

	//Devuelve el mes de la fecha introducida.
	public int getMonth()
	{
		return this.month;
	}

	/*
	 * Modifica el mes de la fecha.
	 *
	 * @param newMonth
	 *	Mes de la nueva fecha.
	 *
	 */
	public void setMonth(int newMonth)
	{
		month=newMonth;
	}

	//Devuelve el año de la fecha introducida.
	public int getYear()
	{
		return this.year;
	}

	/*
	 * Modifica el año de la fecha.
	 *
	 * @param newYear
	 *	Año de la nueva fecha.
	 *
	 */
	public void setYear(int newYear)
	{
		year=newYear;
	}

	/*
	 * Compara el día de las dos fechas, en este caso es el método sin IF.
	 *
	 * @param Date other
	 *	Día de la fecha con la cual se compara.
	 *
	 */
	boolean isSameDay(Date other)
	{
		this.day=other.getDay();
		return true;
	}

	/*
	 * Compara el día de las dos fechas, esta vez empleando IF.
	 *
	 * @param Date other
	 *	Día de la fecha con la cual se compara.
	 *
	 */
	boolean ifIsSameDay(Date other)
	{
		if(this.day==other.getDay())
		{
			return true;
		}
		return false;
	}

	/*
	 *Compara el mes de las dos fechas, en este caso es el método sin IF.
	 *
	 * @param Date other
	 *	Mes de la fecha con la cual se compara.
	 *
	 */
	boolean isSameMonth(Date other)
	{
		this.month=other.getMonth();
		return true;
	}

	/*
	 * Compara el mes de las dos fechas, esta vez empleando IF.
	 *
	 * @param Date other
	 *	Mes de la fecha con la cual se compara.
	 *
	 */	
	boolean ifIsSameMonth(Date other)
	{
		if(this.month==other.getMonth())
		{
			return true;
		}
		return false;
	}

	/*
	 * Compara el año de las dos fechas, en este caso es el método sin IF.
	 *
	 * @param Date other
	 *	Año de la fecha con la cual se compara.
	 *
	 */
	boolean isSameYear(Date other)
	{
		this.year=other.getYear();
		return true;
	}

	/*
	 * Compara el año de las dos fechas, esta vez empleando IF.
	 *
	 * @param Date other
	 *	Año de la fecha con la cual se compara.
	 *
	 */
	boolean ifIsSameYear(Date other)
	{
		if(this.year==other.getYear())
		{
			return true;
		}
		return false;
	}

	/*
	 * Compara las fechas completas, utilizando los tres parametros. En este caso es el método sin IF.
	 *
	 * @param Date other
	 *	Fecha completa con la cual se va a comparar.
	 *
	 */
	boolean isSame(Date other)
	{
		this.day=other.getDay();
		this.month=other.getMonth();
		this.year=other.getYear();
		return true;
	}

	/*
	 *Compara las fechas completas, utilizando los tres parametros. Esta vez utilizando IF.
	 *
	 * @param Date other
	 *	Fecha completa con la cual se va a comparar.
	 *
	 */
	boolean ifIsSame(Date other)	
	{	if((this.day==other.getDay())&&(this.month==other.getMonth())&&(this.year==other.getYear()))
		{
			return true;
		}
		return false;
	}

	//Devuelve el nombre del mes.
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

	/*
	 *Comprueba si el día y el mes son correctos.
	 *
	 * @param
	 *	Día de la fecha.
	 */
	public boolean isDayRight(int day)
	{
		return (this.day>0)&&(day<=this.daysOfMonth(this.month));
	}

	//Devuelve la estación a la que pertenece la fecha introducida.
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

	//Duvuelve los meses que faltan desde la fecha introducida hasta final de año.
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
	
	//Devuelve la fecha introducida.
	public int date()
	{
		return this.day+this.month+this.year;
	}

	//Devuelve las fechas restantes del año.
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

	//Devuelve los meses que tienen los mismos días que el mes de la fecha introducida.
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
	}

	//Calcula los días que has transcurrido desde el inicio del año hasta el día anterior al actual.
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

	//Calcula el número de intentos aleatorios que requiere el método para acertar con la fecha introducida utilizando un bucle Do-While.
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

	//Calcula el número de intentos aleatorios que requiere el método para acertar con la fecha introducida utilizando un bucle While.
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

	//Devuelve el día de la semana que es la fecha introducida.
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

	//Utilizamos "@Override" para forzar al compilador a sobreescribir correctamente un método para evitar errores en tiempo de ejecución.
	@Override

	//Devuelve la fecha introducida.
	public String toString()
	{
		return this.day+"/"+this.month+"/"+this.year;
	}
}

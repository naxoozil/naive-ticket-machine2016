
/**
 * Write a description of class TrainStation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrainStation
{
	private MaquinaDeTickets maquina1;
	private MaquinaDeTickets maquina2;
	private int dineroTotal;

	public TrainStation()
	{
		maquina1 = new MaquinaDeTickets(300);
		maquina2 = new MaquinaDeTickets(200);
		dineroTotal = 0;
       }
  
    public void printTotalMoney()
	{
		dineroTotal = maquina1.obtenerTotal();
		dineroTotal = dineroTotal + maquina2.obtenerTotal();
        System.out.println(dineroTotal);
	}
	
	/**
	 * Simula la venta de un billete en cada una de las máquinas.
	 */
	public void simulacionDeVentaDeBilletes()
	{
	    maquina1.introducirDinero(300);
	    maquina2.introducirDinero(200);
	    maquina1.imprimirTicket();
	    maquina2.imprimirTicket();
	}
}

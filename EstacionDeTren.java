
/**
 * Write a description of class TrainStation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EstacionDeTren
{
	private MaquinaDeTickets maquina1;
	private MaquinaDeTickets maquina2;
	private int dineroTotal;

	public EstacionDeTren()
	{
		maquina1 = new MaquinaDeTickets();
		maquina2 = new MaquinaDeTickets();
		dineroTotal = 0;
       }
  
    public void imprimirDineroTotal()
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

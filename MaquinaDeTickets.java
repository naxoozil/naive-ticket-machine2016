/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MaquinaDeTickets
{
    // The price of a ticket from this machine.
    private int precio;
    // The amount of money entered by a customer so far.
    private int dineroIntroducido;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public MaquinaDeTickets(int coste)
    {
        precio = coste;
        dineroIntroducido = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int obtenerPrecio()
    {
        return precio;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int obtenerDineroIntroducido()
    {
        return dineroIntroducido;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void introducirDinero(int cantidad)
    {
        dineroIntroducido = dineroIntroducido + cantidad;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void imprimirTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + precio + " centimos.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + dineroIntroducido;
        // Clear the balance.
        dineroIntroducido = 0;
    }
}

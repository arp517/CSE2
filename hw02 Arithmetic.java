/////////////////////////////////////
//Anna Putelo
//CSE2
//September 9th, 2014

//define a class
public class Arithmetic{

//  add main method
    public static void main(String args[]) {

//Number of pairs of socks
int nSocks=3;

//Cost per pair of socks
//(‘$’ is part of the variable name)
double sockCost$=2.58;

//Number of drinking glasses
int nGlasses=6;

//Cost per glass
double glassCost$=2.29;

//Number of boxes of envelopes
int nEnvelopes=1;

//cost per box of envelopes
double envelopeCost$=3.25;

//tax information
double taxPercent=0.06;

double totalSocks$, totalGlasses$, totalEnvelopes$;
double costSocks$, costGlasses$, costEnvelopes$;
double taxSocks$, taxGlasses$, taxEnvelopes$;
double totalSockCost$, totalGlassesCost$, totalEnvelopesCost$;


//Print Statements for socks
System.out.println ("SOCK CALCULATIONS");
System.out.println ("Total Socks Bought" +"  "+ nSocks);
System.out.println ("Cost per pair before tax" +"  $"+ sockCost$);
System.out.println ("Tax per pair" + "  $"+ (sockCost$*taxPercent));
System.out.println ("Total cost before tax" + "  $"+ (nSocks*sockCost$));
System.out.println ("----------");

//Print Statements for glasses
System.out.println ("GLASSES CALCULATIONS");
System.out.println ("Total Glasses Bought" +"  "+ nGlasses);
System.out.println ("Cost per glass before tax" + "  $"+ glassCost$);
System.out.println ("Tax per glass"+ "  $"+ (glassCost$*taxPercent));
System.out.println ("Total cost before tax" + "  $"+ (nGlasses*glassCost$));
System.out.println ("----------");

//Print Statements for envelopes
System.out.println ("ENVELOPES CALCULATIONS");
System.out.println ("Total Envelopes Bought" + "  "+ nEnvelopes);
System.out.println ("Cost per envelopes before tax" +"  $"+ envelopeCost$);
System.out.println ("Tax per envelope" + "  $"+ (envelopeCost$*taxPercent));
System.out.println ("Total cost before tax" + "  $"+ (nEnvelopes*envelopeCost$));
System.out.println ("----------");

//run calculations
totalSockCost$=nSocks*sockCost$*taxPercent;
totalGlassesCost$=nGlasses*glassCost$*taxPercent;
totalEnvelopesCost$=nEnvelopes*envelopeCost$*taxPercent;

double totalTax$=(totalEnvelopesCost$+totalGlassesCost$+totalSockCost$);
double totalTransaction$=(totalTax$+(nEnvelopes*envelopeCost$)+(nSocks*sockCost$)+(nGlasses*glassCost$));

//More Print Statements
System.out.println ("TOTAL TRANSACTIONS");
System.out.println ("The total transaction cost was" + "  $"+ totalTransaction$);


} //end method
} //end class

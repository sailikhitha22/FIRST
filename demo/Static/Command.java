package Static;

public class Command {


public static void main(String[] args) {

String f = "";
if (args.length == 0)
{
System.out.println("No values");
}
else 
{
for (int i = 0; i < args.length; i++) 
{
if (i == 0)
f = args[0];
else
f = f + "," + args[i];
}

}
System.out.println(f);
}

}
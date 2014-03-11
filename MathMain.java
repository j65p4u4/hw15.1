import java.util.*;

public class MathMain{
	public static void main(String[] args) {
                //New the object of the Function class
		AFunction a = new AFunction();
		BFunction b = new BFunction();
		CFunction c = new CFunction();
		DFunction d = new DFunction();
		EFunction e = new EFunction();
		FFunction f = new FFunction();
		GFunction g = new GFunction();
		System.out.println("Please key the number :");
		Scanner input = new Scanner(System.in);
		MathFunction mathFunction = new MathFunction();
		//Key the number that calculate AFunction
		double num1 = input.nextDouble();
                //Show the answer of the AFunction
		System.out.println("The answer of the question x * x = "
				+ mathFunction.getAFunction( a.f(num1));
		System.out.println("Please key the number :");
		//Key the number that calculate BFunction
		double num2 = input.nextDouble();
                //Show the answer of the BFunction
		System.out.println("The answer of the question sin(x) = "
				+ mathFunction.getBFunction(b.f(num2)));
		System.out.println("Please key the number :");
		//Key the number that calculate CFunction
		double num3 = input.nextDouble();
                //Show the answer of the CFunction
		System.out.println("The answer of the question cos(x) = "
				+ mathFunction.getCFunction(c.f(num3)));
		System.out.println("Please key the number :");
		//Key the number that calculate DFunction
		double num4 = input.nextDouble();
                //Show the answer of the DFunction
		System.out.println("The answer of the question tan(x) = "
				+ mathFunction.getDFunction(d.f(num4)));
		System.out.println("Please key the number :");
		//Key the number that calculate EFunction
		double num5 = input.nextDouble();
                //Show the answer of the EFunction
		System.out.println("The answer of the question cos(x) + 5*sin(x) = "
				+ mathFunction.getEFunction(e.f(num5)));
		System.out.println("Please key the number :");
		//Key the number that calculate FFunction
		double num6 = input.nextDouble();
                //Show the answer of the FFunction
		System.out.println("The answer of the question 5*cos(x) + sin(x) = "
				+ mathFunction.getFFunction(f.f(num6)));
		System.out.println("Please key the number :");
		//Key the number that calculate GFunction
		double num7 = input.nextDouble();
		//Show the answer of the GFunction
		System.out.println("The answer of the question log(x) + x*x = "
				+ mathFunction.getGFunction(g.f(num7)));
	}
}

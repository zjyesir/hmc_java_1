package genericity;

/**
 * 
 * @author ianye
 *
 *四元组，包含4个信息
 * @param <A> 
 * @param <B>
 * @param <C>
 * @param <D>
 */
public class Tuple4<A,B,C,D> {

	A infoA;
	B infoB;
	C infoC;
	D infoD;
	public Tuple4(A a, B b,C c,D d) { 
		infoA = a;
		infoB = b;
		infoC = c;
		infoD = d;
	}
	
	public String info() {
		return infoA + ", " + infoB + ", " + infoC + ", " + infoD;
	}

    @Override
    public String toString() {
        return "(" + info() + ")";
    }
}

public class ArrayMain07 {
	public static void main(String[] args) {
		if(args.length>0) {
			for(int i=0;i<args.length;i++) {
				System.out.print(args[i] + "\t");
			}
		}else {//length==0
			System.out.println("입력한 내용이 없습니다!");
		}
	}
}

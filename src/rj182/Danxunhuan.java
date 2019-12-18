package rj182;

public class Danxunhuan {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] yb={"管理学院","音乐学院","教育学院","表演艺术学院","演艺学院","中专部"	,"饮食文化学院"};
		/*第一轮
		*012345
		*0-5 1-4 2-3
		*第二轮
		*051234
		*0-4 5-3 1-2
		*第三轮
		*045123
		*0-3 4-2 5-1
		*第四轮
		*034512
		*0-2 3-1 4-5
		*第五轮
		*023541
		*0-1 3-4 3-5
		*/
		System.out.println("第九届江汉艺术职业学院篮球赛对阵表：");
		for(int i=1;i<yb.length;i++) {
			System.out.println("第"+i+"轮");
			if (i>1) {
				int k=yb.length-1;
				String stemp=yb[k];
				
				for(;k>1;k--)
					yb[k]=yb[k-1];
				
				yb[1]=stemp;
			}
			for(int j=0;j<yb.length/2;j++) {
				System.out.println(yb[j]+"VS"+yb[yb.length-j-1]);
				if(j==yb.length/2-1) {
					System.out.println(yb[j+1]+"轮空");
				}
			}
			
		}
	}
}

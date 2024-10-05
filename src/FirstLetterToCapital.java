
public class FirstLetterToCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s= "hello java world";
        String[] words=s.split(" ");
        String result="";
        for(int i=0;i<words.length;i++) {
            result=words[i].substring(0,1).toUpperCase()+words[i].substring(1);
            System.out.print(result+" ");
	}
        

}
}
public class strinhg {
    public static void main(String[] args){

        /*java string
         *String Length
         * toUpperCase() 
         * toLowerCase()
         * indexOf()
         * concat()
         */
        String name="Avneesh singh yadav";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf("singh"));
        String fname="Avneesh ";
        String lname="yadav";
        System.out.println(fname.concat(lname));
        String str="Hello Mr Avneesh \"singh\" yadav";
        System.out.println(str);

    }
    
}

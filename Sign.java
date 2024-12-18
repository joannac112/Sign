public class Sign
{
    private String message;
    private int width;
    public Sign(string m, int w){
        message = m;
        width = w;
    }

    public int numberOfLines(){
        return message.length()/width+1;
    }
}
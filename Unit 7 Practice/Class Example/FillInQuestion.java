
public class FillInQuestion extends Question
{
    // specified question: "The inventor of Java was _James Gosling_"
    //parse the specified question into a question to display and and answer to check:
    //question: "The inventor of Java was ___"
    //answer: "James Gosling"
    public FillInQuestion()
    {
        
    }
    
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "____" + parser.next();
        
        super.setText(question);
        super.setAnswer(question);
    }

}



import java.util.*;
import java.lang.*;
import java.io.*;

/* Requirements 
1. Guest member can seach and view questions
2. Member can post new question
3. Member can add new answer
4. Member can add comments to quetion or answer
5. Member can upvote/downvote question, answer or comments
6.Member can flag an question answer or comment for moderator attention
7. Member can earn badges
8.Member can vote to delete or close a question
9.Moderators can close a question, delete a question or undelete an already deleted question
7. 
*/
class StackOverflow
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	}
	
}
class Guest
{
    int sessionId;
    Seach seachObj;
    public List<Question> seachQuestion(String seachString);
}
class Member extends Guest
{
    Account account;
    List<Badge> badges;
    void postQuestion(Question question);
    void addAnswer(Question question, Answer answer);
    void addComment(Entity entity,Comment comment);
    void voteForEntity(Entity entity, VoteType voteType);
    void flagEntity(Entity entity);
    void earnBadge(Badge badge);
}

enum VoteType
{
    UPVOTE,DOWNVOTE,DELETEVOTE,CLOSEVOTE
}
class Moderator extends Member
{
    void closeQuestion(Question question);
    void deleteQuestion(Question question);
    void undeleteQuestion(Question question)
}
class Entity
{
    int entityId;
    Map<VoteType,Integer> votes;
    List<Flag> flags;
    Member member;
    Date creationDate;
}
class Question
{
    String questionTitle;
    String questionDescription;
    QuestionStatus questionStatus;
    List<Answer> answers;
    List<Comment> comments;
    void addAnswer(Answer answer);
    void addCommnet(Comment comment);
    
    
    
}
enum QuestionStatus
{
    OPEN;CLOSED;DELETED
}

class Answer extends Entity
{
    String descrption;
    List<Comment> comment;
    void addToQuestion(Question question);
    void addComment(Comment comment);
}
class Flag
{
    Member member;
    Date flagDate;
}
class Comment
{
    String commentDescription;
    
}
class badge
{
    String description;
}
class Account
{
    String username;
    String password;
    String name;
    String email;
    
}


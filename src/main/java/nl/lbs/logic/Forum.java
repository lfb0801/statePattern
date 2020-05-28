package nl.lbs.logic;

public class Forum {
    private ForumOptions forumOptionsState;
    private ForumOptions guest;
    private ForumOptions member;
    private ForumOptions moderator;

    public Forum(){
        // start voor ieder gebruikersniveau de opties
        guest = new GuestOptions();
        member = new MemberOptions();
        moderator = new ModeratorOptions();

        // stel een start status in
        forumOptionsState = guest;
    }

    public void setForumOptionsState(ForumOptions newState){
        this.forumOptionsState = newState;
    }

    public ForumOptions getForumOptionsState(){
        return forumOptionsState;
    }

    public ForumOptions getGuestOptions() {
        return guest;
    }

    public ForumOptions getMemberOptions() {
        return member;
    }

    public ForumOptions getModeratorOptions() {
        return moderator;
    }
}

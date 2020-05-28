package nl.lbs.logic;

public class Forum {
    private ForumOptions forumOptionsState;

    public Forum(){
        // stel een start status in
        forumOptionsState = new GuestOptions();
    }

    void setForumOptionsState(ForumOptions newState){
        this.forumOptionsState = newState;
    }

    public ForumOptions getForumOptionsState(){
        return forumOptionsState;
    }

    ForumOptions getGuestOptions() {
        return new GuestOptions();
    }

    ForumOptions getMemberOptions() {
        return new MemberOptions();
    }

    ForumOptions getModeratorOptions() {
        return new ModeratorOptions();
    }
}

package nl.lbs.logic;

import nl.lbs.logic.config.GuestOptions;
import nl.lbs.logic.config.MemberOptions;
import nl.lbs.logic.config.ModeratorOptions;

public class Forum {
    private ForumOptions forumOptionsState;

    public Forum(ForumOptions _forumOptionsState){
        // stel een start status in
        forumOptionsState = _forumOptionsState;
    }

    public void setForumOptionsState(ForumOptions newState){
        this.forumOptionsState = newState;
    }

    public ForumOptions getForumOptionsState(){
        return forumOptionsState;
    }

    public ForumOptions getGuestOptions() {
        return new GuestOptions();
    }

    public ForumOptions getMemberOptions() {
        return new MemberOptions();
    }

    public ForumOptions getModeratorOptions() {
        return new ModeratorOptions();
    }
}

package nl.lbs.logic;

import nl.lbs.logic.config.GuestOptions;
import nl.lbs.logic.config.MemberOptions;
import nl.lbs.logic.config.ModeratorOptions;

public class Forum implements ForumOptions {
    private ForumOptions forumOptionsState;

    public Forum(ForumOptions _forumOptionsState){
        forumOptionsState = _forumOptionsState;
    }

    public void setForumOptionsState(ForumOptions newState){
        this.forumOptionsState = newState;
    }

    @Override
    public String upgradeUserType(Forum forum) {
        return this.forumOptionsState.upgradeUserType(forum);
    }

    @Override
    public String downgradeUserType(Forum forum) {
        return this.forumOptionsState.downgradeUserType(forum);
    }

    @Override
    public String addComment() {
        return this.forumOptionsState.addComment();
    }

    @Override
    public String addTopic() {
        return this.forumOptionsState.addTopic();
    }
}

package nl.lbs.logic.config;

import nl.lbs.logic.Forum;
import nl.lbs.logic.ForumOptions;

public class MemberOptions implements ForumOptions {
    @Override
    public String upgradeUserType(Forum forum) {
        forum.setForumOptionsState(forum.getModeratorOptions());
        return "U bent van Member naar Moderator opgewaardeerd";
    }

    @Override
    public String downgradeUserType(Forum forum) {
        forum.setForumOptionsState(forum.getGuestOptions());
        return "U bent van Member naar Guest overgestapt.";
    }

    @Override
    public String addComment() {
        return "U kunt als Member een comment plaatsen.";
    }

    @Override
    public String addTopic() {
        return "U kunt als Member geen Topics starten.";
    }
}

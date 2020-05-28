package nl.lbs.logic.config;

import nl.lbs.logic.Forum;
import nl.lbs.logic.ForumOptions;

public class MemberOptions implements ForumOptions {
    @Override
    public String upgradeUserType(Forum forum) {
        forum.setForumOptionsState(new ModeratorOptions());
        return "U bent van Member naar Moderator opgewaardeerd";
    }

    @Override
    public String downgradeUserType(Forum forum) {
        forum.setForumOptionsState(new GuestOptions());
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

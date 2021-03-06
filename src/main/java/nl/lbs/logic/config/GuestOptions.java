package nl.lbs.logic.config;

import nl.lbs.logic.Forum;
import nl.lbs.logic.ForumOptions;

public class GuestOptions implements ForumOptions {
    @Override
    public String upgradeUserType(Forum forum) {
        forum.setForumOptionsState(new MemberOptions());
        return "U bent van Guest naar Member opgewaardeerd";
    }

    @Override
    public String downgradeUserType(Forum forum) {
        // bent al op laagste niveau
        return "U kunt vanaf Guest niveau alleen opwaarderen.";
    }

    @Override
    public String addComment() {
        return "U kunt als Guest geen Comments plaatsen.";
    }

    @Override
    public String addTopic() {
        return "U kunt als Guest geen Topics starten.";
    }
}

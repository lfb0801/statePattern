package nl.lbs.logic.config;

import nl.lbs.logic.Forum;
import nl.lbs.logic.ForumOptions;

public class ModeratorOptions implements ForumOptions {

    @Override
    public String upgradeUserType(Forum forum) {
        // bent al op hoogste niveau
        return "U kunt geen hoger gebruikersniveau kiezen.";
    }

    @Override
    public String downgradeUserType(Forum forum) {
        forum.setForumOptionsState(forum.getMemberOptions());
        return "U bent van Moderator naar Member overgestapt.";
    }

    @Override
    public String addComment() {
        return "U kunt als Moderator een comment plaatsen.";
    }

    @Override
    public String addTopic() {
        return "U kunt als Moderator een Topics starten.";
    }
}

package nl.lbs.logic;

public interface ForumOptions {

    String upgradeUserType(Forum forum);
    String downgradeUserType(Forum forum);

    String addComment();
    String addTopic();
}

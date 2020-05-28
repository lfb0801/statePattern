package nl.lbs.logic;

public interface ForumOptions {

    // de menu opties om gebruiker en dus de State te veranderen
    String upgradeUserType(Forum forum);
    String downgradeUserType(Forum forum);

    // de menu opties om het forum te bedienen
    String addComment();
    String addTopic();
}

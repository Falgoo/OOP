package nguyenxuannghia_20001954.lab11.iterator.exercise2;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileId);
    ProfileIterator createCoworkersIterator(String profileId);
}

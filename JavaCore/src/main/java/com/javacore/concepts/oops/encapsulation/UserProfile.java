package com.javacore.concepts.oops.encapsulation;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public class UserProfile {
    // all fields are private to enforce encapsulation
    private UUID id;
    private String username;
    private String fullName;
    private String email;
    private String passwordHash;
    private LocalDate dateOfBirth;
    private Gender gender;
    private String phone;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;
    private Set<String> roles;
    private boolean active;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant lastLogin;
    private String profilePictureUrl;
    private String bio;
    private Map<String, String> preferences;

    public UserProfile(String username, String fullName, String email, String passwordHash,
                       LocalDate dateOfBirth) {
        this.id = UUID.randomUUID();
        setUsername(username);
        setFullName(fullName);
        setEmail(email);
        setPasswordHash(passwordHash);
        this.dateOfBirth = dateOfBirth;
        this.gender = Gender.UNDISCLOSED;
        this.roles = new HashSet<>();
        this.preferences = new HashMap<>();
        this.active = true;
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    public UserProfile() {
        this.id = UUID.randomUUID();
        this.roles = new HashSet<>();
        this.preferences = new HashMap<>();
        this.active = true;
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
        this.gender = Gender.UNDISCLOSED;
    }

    // Basic getters and setters with simple validation and defensive copies

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = Objects.requireNonNull(username, "username cannot be null").trim();
        this.updatedAt = Instant.now();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
        this.updatedAt = Instant.now();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null) {
            String e = email.trim();
            if (!e.contains("@") || e.startsWith("@") || e.endsWith("@")) {
                throw new IllegalArgumentException("invalid email");
            }
            this.email = e;
        } else {
            this.email = null;
        }
        this.updatedAt = Instant.now();
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = Objects.requireNonNull(passwordHash, "passwordHash cannot be null");
        this.updatedAt = Instant.now();
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        this.updatedAt = Instant.now();
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender == null ? Gender.UNDISCLOSED : gender;
        this.updatedAt = Instant.now();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
        this.updatedAt = Instant.now();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
        this.updatedAt = Instant.now();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
        this.updatedAt = Instant.now();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
        this.updatedAt = Instant.now();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
        this.updatedAt = Instant.now();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
        this.updatedAt = Instant.now();
    }

    public Set<String> getRoles() {
        return Collections.unmodifiableSet(roles);
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles == null ? new HashSet<>() : new HashSet<>(roles);
        this.updatedAt = Instant.now();
    }

    public void addRole(String role) {
        if (role != null) {
            this.roles.add(role.trim());
            this.updatedAt = Instant.now();
        }
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
        this.updatedAt = Instant.now();
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public Instant getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Instant lastLogin) {
        this.lastLogin = lastLogin;
        this.updatedAt = Instant.now();
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl == null ? null : profilePictureUrl.trim();
        this.updatedAt = Instant.now();
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio == null ? null : bio.trim();
        this.updatedAt = Instant.now();
    }

    public Map<String, String> getPreferences() {
        return Collections.unmodifiableMap(preferences);
    }

    public void setPreferences(Map<String, String> preferences) {
        this.preferences = preferences == null ? new HashMap<>() : new HashMap<>(preferences);
        this.updatedAt = Instant.now();
    }

    public void putPreference(String key, String value) {
        if (key != null) {
            this.preferences.put(key, value);
            this.updatedAt = Instant.now();
        }
    }

    public int getAge() {
        if (this.dateOfBirth == null) return -1;
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserProfile that = (UserProfile) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", active=" + active +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    public enum Gender {
        MALE, FEMALE, OTHER, UNDISCLOSED
    }
}

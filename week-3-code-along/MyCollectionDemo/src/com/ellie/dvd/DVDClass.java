package com.ellie.dvd;

import java.util.Objects;

public class DVDClass {
private String title;
private int releaseDate;
private int mpaaRating;
private int directorRating;
private String studio;
private String userNotes;

public DVDClass() {
	
}

public DVDClass(String title, int releaseDate, int mpaaRating, int directorRating, String studio, String userNotes) {
	super();
	this.title = title;
	this.releaseDate = releaseDate;
	this.mpaaRating = mpaaRating;
	this.directorRating = directorRating;
	this.studio = studio;
	this.userNotes = userNotes;
}

@Override
public String toString() {
	return "DVDClass [title=" + title + ", releaseDate=" + releaseDate + ", mpaaRating=" + mpaaRating
			+ ", directorRating=" + directorRating + ", studio=" + studio + ", userNotes=" + userNotes + "]";
}


@Override
public int hashCode() {
	return Objects.hash(directorRating, mpaaRating, releaseDate, studio, title, userNotes);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	DVDClass other = (DVDClass) obj;
	return directorRating == other.directorRating && mpaaRating == other.mpaaRating && releaseDate == other.releaseDate
			&& Objects.equals(studio, other.studio) && Objects.equals(title, other.title)
			&& Objects.equals(userNotes, other.userNotes);
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public int getReleaseDate() {
	return releaseDate;
}

public void setReleaseDate(int releaseDate) {
	this.releaseDate = releaseDate;
}

public int getMpaaRating() {
	return mpaaRating;
}

public void setMpaaRating(int mpaaRating) {
	this.mpaaRating = mpaaRating;
}

public int getDirectorRating() {
	return directorRating;
}

public void setDirectorRating(int directorRating) {
	this.directorRating = directorRating;
}

public String getStudio() {
	return studio;
}

public void setStudio(String studio) {
	this.studio = studio;
}

public String getUserNotes() {
	return userNotes;
}

public void setUserNotes(String userNotes) {
	this.userNotes = userNotes;
}

}

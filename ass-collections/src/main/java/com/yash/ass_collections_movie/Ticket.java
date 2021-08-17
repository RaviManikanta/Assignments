package com.yash.ass_collections_movie;

import java.util.Objects;

public class Ticket 
{
 int ticket_id;
 int seat_no;
 String time;
 
 
@Override
public String toString() {
	return "Ticket [ticket_id=" + ticket_id + ", seat_no=" + seat_no + ", time=" + time + "]";
}
public Ticket(int ticket_id, int seat_no, String time) {
	super();
	this.ticket_id = ticket_id;
	this.seat_no = seat_no;
	this.time = time;
}
@Override
public int hashCode() {
	return Objects.hash(seat_no, ticket_id, time);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof Ticket))
		return false;
	Ticket other = (Ticket) obj;
	return seat_no == other.seat_no && ticket_id == other.ticket_id && Objects.equals(time, other.time);
}
 
 
}

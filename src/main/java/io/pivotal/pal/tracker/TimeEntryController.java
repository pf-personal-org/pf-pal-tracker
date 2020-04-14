package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TimeEntryController {
    public TimeEntryController() {
    
}

	public TimeEntryController(TimeEntryRepository timeEntryRepository) {
	}

	public ResponseEntity create(TimeEntry timeEntryToCreate) {
		return null;
	}

	public ResponseEntity<TimeEntry> read(long timeEntryId) {
		return null;
	}

	public ResponseEntity<List<TimeEntry>> list() {
		return null;
	}

	public ResponseEntity update(long timeEntryId, TimeEntry expected) {
		return null;
	}

	public ResponseEntity delete(long timeEntryId) {
		return null;
	}
}
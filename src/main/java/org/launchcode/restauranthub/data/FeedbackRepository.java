package org.launchcode.restauranthub.data;

import org.launchcode.restauranthub.models.Feedback;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends CrudRepository <Feedback,Integer> {
}
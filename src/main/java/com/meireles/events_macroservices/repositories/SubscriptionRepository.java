package com.meireles.events_macroservices.repositories;

import com.meireles.events_macroservices.domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

}

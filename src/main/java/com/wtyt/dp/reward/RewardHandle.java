package com.wtyt.dp.reward;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RewardHandle {

	public static void main(String[] args) {
		// 得到一个用户，给用户返利
		User user1 = new User();
		user1.setUserId(1);
		user1.setUserName("小明");
		user1.setUserType(1);// 新用户
		User user2 = new User();
		user2.setUserId(2);
		user2.setUserName("小强");
		user2.setUserType(2);// 老用户
		User user3 = new User();
		user3.setUserId(3);
		user3.setUserName("小红");
		user3.setUserType(3);// 老用户
		List<User> users = new ArrayList<>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.forEach((user) -> {
			// 工厂生产策略
			RewardStrategyFactory factory = new RewardStrategyFactory();
			RewardStrategy strategy = factory.createRewardStrategy(user);
			// 策略执行返利
			Optional.ofNullable(strategy).ifPresent(s -> s.doStrategy(user));
		});
	}

}

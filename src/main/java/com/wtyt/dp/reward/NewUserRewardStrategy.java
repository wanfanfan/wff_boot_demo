package com.wtyt.dp.reward;

public class NewUserRewardStrategy implements RewardStrategy {


	@Override
	public void doStrategy(User user) {
		System.out.println("新用户" + user.getUserName() + "返奖策略");
	}

}

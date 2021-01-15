package com.wtyt.dp.reward;

public class SpecialRewardStrategy implements RewardStrategy {

	@Override
	public void doStrategy(User user) {
		System.out.println("特殊用户" + user.getUserName() + "返奖策略");
	}

}

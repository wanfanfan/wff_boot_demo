package com.wtyt.dp.reward;

public class OldRewardStrategy implements RewardStrategy {

	@Override
	public void doStrategy(User user) {
		System.out.println("老用户" + user.getUserName() + "返奖策略");
	}

}

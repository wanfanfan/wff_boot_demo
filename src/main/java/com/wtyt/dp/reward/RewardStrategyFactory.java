package com.wtyt.dp.reward;

import java.util.HashMap;
import java.util.Map;

public class RewardStrategyFactory implements Factory {

	private static Map<Integer, Class<?>> map = new HashMap<>();
	static {
		map.put(1, NewUserRewardStrategy.class);
		map.put(2, OldRewardStrategy.class);
	}
	
	@Override
	public RewardStrategy createRewardStrategy(User user) {
		try {
			Class<?> clazz = map.get(user.getUserType());
			if (clazz == null) {
				//throw new Exception("不存在" + user.getUserName() + "的返利策略");
				return SpecialRewardStrategy.class.newInstance();
			}
			return (RewardStrategy) clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			System.out.println("出错啦");
		} 
		return null;

	}

	

}

package kawws.kawwsrandoms;

import kawws.kawwsrandoms.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KawwsRandoms implements ModInitializer {
public static final String MOD_ID = "kawwsrandoms";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
	}
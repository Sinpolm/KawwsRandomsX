package kawws.kawwsrandoms;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KawwsRandoms implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("kawws-randoms");

	@Override
	public void onInitialize() {LOGGER.info("Hello World");
	};}
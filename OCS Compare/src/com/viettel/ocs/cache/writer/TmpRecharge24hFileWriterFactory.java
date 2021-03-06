package com.viettel.ocs.cache.writer;

import java.io.File;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

import com.viettel.ocs.util.Constant;

import net.sf.ehcache.Ehcache;
import net.sf.ehcache.writer.CacheWriter;
import net.sf.ehcache.writer.CacheWriterFactory;

/**
 * @author Alex Snaps
 */
public class TmpRecharge24hFileWriterFactory extends CacheWriterFactory {

//	private static final String PATH = StringUtils.trimToEmpty( PropsUtil.getInstance().getValue("msisdn.info.1.path"));

	@Override
	public CacheWriter createCacheWriter(final Ehcache ehcache, final Properties properties) {
		if (StringUtils.equals(Constant.STEP, "2"))
			return new TmpRecharge24hFileWriter(new File(Constant.PATH_STEP_2 + "/" + Constant.TMP_RECHARGE_24H + ".txt"));
		
		return new TmpRecharge24hFileWriter(new File(Constant.PATH_STEP_1 + "/" + Constant.TMP_RECHARGE_24H + ".txt"));
	}
}
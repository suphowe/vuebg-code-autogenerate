package com.vuebg.generator.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * IO相关工具类
 * @author suphowe
 * @date 2019-12-23
 */
public class IOUtils {

	/**
	 * 关闭对象，连接
	 * @param closeable
	 */
    public static void closeQuietly(final Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (final IOException ioe) {
            // ignore
        }
    }
}

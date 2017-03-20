package ro.ovidiuconeac.foodtavern.androidapp.components.common;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

/**
 * Created by www.ovidiuconeac.ro on 3/20/17.
 */

public class CacheTest {

    private Cache cache;

    @Before
    public void setUp() {
        cache = mock(Cache.class);
    }

    @After
    public void tearDown() {
        cache = null;
    }

    @Test
    public void testCachePresenter() {
        doNothing().when(cache).cachePresenterFor(any(), any());
        cache.cachePresenterFor(any(), any());
    }

    @Test
    public void testCacheRestorePresenter() {
        doNothing().when(cache).restorePresenterFor(any());
        cache.restorePresenterFor(any());
    }
}

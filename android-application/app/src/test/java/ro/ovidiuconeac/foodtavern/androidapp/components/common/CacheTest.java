package ro.ovidiuconeac.foodtavern.androidapp.components.common;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

/**
 * Created by www.ovidiuconeac.ro on 3/20/17.
 */

public class CacheTest {

    private Cache cache;
    private Presenter presenter;

    @Before
    public void setUp() {
        cache = mock(Cache.class);
        presenter = mock(Presenter.class);
    }

    @After
    public void tearDown() {
        cache = null;
        presenter = null;
    }

    @Test
    public void testCachePresenter() {
        doNothing().when(cache).cachePresenterFor(any(), any());
        cache.cachePresenterFor(any(), any());
    }

    @Test
    public void testCacheRestorePresenter() {
        when(cache.restorePresenterFor(any())).thenReturn(presenter);
        Presenter result = cache.restorePresenterFor(any());
        assertNotNull(presenter);
    }
}

package org.cloudfoundry.samples.music.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.cloudfoundry.samples.music.domain.Album;

@ApplicationScoped
public class AlbumRepository implements PanacheRepositoryBase<Album,String> {

}

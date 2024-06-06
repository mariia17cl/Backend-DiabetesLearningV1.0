package com.dawes.DiabetesLearning.servicioImpl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.dawes.DiabetesLearning.modelo.RolVO;
import com.dawes.DiabetesLearning.repositorio.RolRepository;
import com.dawes.DiabetesLearning.servicios.ServicioRol;

/**
 * Implementación del servicio para la entidad RolVO. Proporciona las
 * operaciones de negocio relacionadas con los roles.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */

@Service
public class ServicioRolImpl implements ServicioRol {

	@Autowired
	private RolRepository rolr;

	/* añadidos */
	@Override
	public Optional<RolVO> findByNombreRol(String nombreRol) {
		return rolr.findByNombreRol(nombreRol);
	}

	//
	@Override
	public <S extends RolVO> S save(S entity) {
		return rolr.save(entity);
	}

	@Override
	public <S extends RolVO> List<S> saveAll(Iterable<S> entities) {
		return rolr.saveAll(entities);
	}

	@Override
	public <S extends RolVO> Optional<S> findOne(Example<S> example) {
		return rolr.findOne(example);
	}

	@Override
	public List<RolVO> findAll(Sort sort) {
		return rolr.findAll(sort);
	}

	@Override
	public void flush() {
		rolr.flush();
	}

	@Override
	public Page<RolVO> findAll(Pageable pageable) {
		return rolr.findAll(pageable);
	}

	@Override
	public <S extends RolVO> S saveAndFlush(S entity) {
		return rolr.saveAndFlush(entity);
	}

	@Override
	public <S extends RolVO> List<S> saveAllAndFlush(Iterable<S> entities) {
		return rolr.saveAllAndFlush(entities);
	}

	@Override
	public List<RolVO> findAll() {
		return rolr.findAll();
	}

	@Override
	public List<RolVO> findAllById(Iterable<Integer> ids) {
		return rolr.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<RolVO> entities) {
		rolr.deleteInBatch(entities);
	}

	@Override
	public <S extends RolVO> Page<S> findAll(Example<S> example, Pageable pageable) {
		return rolr.findAll(example, pageable);
	}

	@Override
	public Optional<RolVO> findById(Integer id) {
		return rolr.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<RolVO> entities) {
		rolr.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return rolr.existsById(id);
	}

	@Override
	public <S extends RolVO> long count(Example<S> example) {
		return rolr.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		rolr.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends RolVO> boolean exists(Example<S> example) {
		return rolr.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		rolr.deleteAllInBatch();
	}

	@Override
	public RolVO getOne(Integer id) {
		return rolr.getOne(id);
	}

	@Override
	public <S extends RolVO, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return rolr.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return rolr.count();
	}

	@Override
	public void deleteById(Integer id) {
		rolr.deleteById(id);
	}

	@Override
	public RolVO getById(Integer id) {
		return rolr.getById(id);
	}

	@Override
	public void delete(RolVO entity) {
		rolr.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		rolr.deleteAllById(ids);
	}

	@Override
	public RolVO getReferenceById(Integer id) {
		return rolr.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends RolVO> entities) {
		rolr.deleteAll(entities);
	}

	@Override
	public <S extends RolVO> List<S> findAll(Example<S> example) {
		return rolr.findAll(example);
	}

	@Override
	public <S extends RolVO> List<S> findAll(Example<S> example, Sort sort) {
		return rolr.findAll(example, sort);
	}

	@Override
	public void deleteAll() {
		rolr.deleteAll();
	}

}

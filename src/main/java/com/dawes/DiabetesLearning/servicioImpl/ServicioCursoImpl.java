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

import com.dawes.DiabetesLearning.modelo.CursoVO;
import com.dawes.DiabetesLearning.repositorio.CursoRepository;
import com.dawes.DiabetesLearning.servicios.ServicioCurso;

/**
 * Implementación del servicio para la entidad CursoVO. Proporciona las
 * operaciones de negocio relacionadas con los cursos.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */

@Service

public class ServicioCursoImpl implements ServicioCurso {

	@Autowired
	private CursoRepository cur;

	@Override
	public <S extends CursoVO> S save(S entity) {
		return cur.save(entity);
	}

	@Override
	public <S extends CursoVO> List<S> saveAll(Iterable<S> entities) {
		return cur.saveAll(entities);
	}

	@Override
	public <S extends CursoVO> Optional<S> findOne(Example<S> example) {
		return cur.findOne(example);
	}

	@Override
	public List<CursoVO> findAll(Sort sort) {
		return cur.findAll(sort);
	}

	@Override
	public void flush() {
		cur.flush();
	}

	@Override
	public Page<CursoVO> findAll(Pageable pageable) {
		return cur.findAll(pageable);
	}

	@Override
	public <S extends CursoVO> S saveAndFlush(S entity) {
		return cur.saveAndFlush(entity);
	}

	@Override
	public <S extends CursoVO> List<S> saveAllAndFlush(Iterable<S> entities) {
		return cur.saveAllAndFlush(entities);
	}

	@Override
	public List<CursoVO> findAll() {
		return cur.findAll();
	}

	@Override
	public List<CursoVO> findAllById(Iterable<Integer> ids) {
		return cur.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<CursoVO> entities) {
		cur.deleteInBatch(entities);
	}

	@Override
	public <S extends CursoVO> Page<S> findAll(Example<S> example, Pageable pageable) {
		return cur.findAll(example, pageable);
	}

	@Override
	public Optional<CursoVO> findById(Integer id) {
		return cur.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<CursoVO> entities) {
		cur.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return cur.existsById(id);
	}

	@Override
	public <S extends CursoVO> long count(Example<S> example) {
		return cur.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		cur.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends CursoVO> boolean exists(Example<S> example) {
		return cur.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		cur.deleteAllInBatch();
	}

	@Override
	public CursoVO getOne(Integer id) {
		return cur.getOne(id);
	}

	@Override
	public <S extends CursoVO, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return cur.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return cur.count();
	}

	@Override
	public void deleteById(Integer id) {
		cur.deleteById(id);
	}

	@Override
	public CursoVO getById(Integer id) {
		return cur.getById(id);
	}

	@Override
	public void delete(CursoVO entity) {
		cur.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		cur.deleteAllById(ids);
	}

	@Override
	public CursoVO getReferenceById(Integer id) {
		return cur.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends CursoVO> entities) {
		cur.deleteAll(entities);
	}

	@Override
	public <S extends CursoVO> List<S> findAll(Example<S> example) {
		return cur.findAll(example);
	}

	@Override
	public <S extends CursoVO> List<S> findAll(Example<S> example, Sort sort) {
		return cur.findAll(example, sort);
	}

	@Override
	public void deleteAll() {
		cur.deleteAll();
	}

}

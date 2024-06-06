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

import com.dawes.DiabetesLearning.modelo.NoticiaVO;
import com.dawes.DiabetesLearning.repositorio.NoticiaRepository;
import com.dawes.DiabetesLearning.servicios.ServicioNoticia;

/**
 * Implementación del servicio para la entidad NoticiaVO.
 * Proporciona las operaciones de negocio relacionadas con las noticias.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */
@Service

public class ServicioNoticiaImpl implements ServicioNoticia {

	@Autowired
	private NoticiaRepository nr;

	@Override
	public <S extends NoticiaVO> S save(S entity) {
		return nr.save(entity);
	}

	@Override
	public <S extends NoticiaVO> List<S> saveAll(Iterable<S> entities) {
		return nr.saveAll(entities);
	}

	@Override
	public <S extends NoticiaVO> Optional<S> findOne(Example<S> example) {
		return nr.findOne(example);
	}

	@Override
	public List<NoticiaVO> findAll(Sort sort) {
		return nr.findAll(sort);
	}

	@Override
	public void flush() {
		nr.flush();
	}

	@Override
	public Page<NoticiaVO> findAll(Pageable pageable) {
		return nr.findAll(pageable);
	}

	@Override
	public <S extends NoticiaVO> S saveAndFlush(S entity) {
		return nr.saveAndFlush(entity);
	}

	@Override
	public <S extends NoticiaVO> List<S> saveAllAndFlush(Iterable<S> entities) {
		return nr.saveAllAndFlush(entities);
	}

	@Override
	public List<NoticiaVO> findAll() {
		return nr.findAll();
	}

	@Override
	public List<NoticiaVO> findAllById(Iterable<Integer> ids) {
		return nr.findAllById(ids);
	}

	@Override
	public void deleteInBatch(Iterable<NoticiaVO> entities) {
		nr.deleteInBatch(entities);
	}

	@Override
	public <S extends NoticiaVO> Page<S> findAll(Example<S> example, Pageable pageable) {
		return nr.findAll(example, pageable);
	}

	@Override
	public Optional<NoticiaVO> findById(Integer id) {
		return nr.findById(id);
	}

	@Override
	public void deleteAllInBatch(Iterable<NoticiaVO> entities) {
		nr.deleteAllInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return nr.existsById(id);
	}

	@Override
	public <S extends NoticiaVO> long count(Example<S> example) {
		return nr.count(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		nr.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends NoticiaVO> boolean exists(Example<S> example) {
		return nr.exists(example);
	}

	@Override
	public void deleteAllInBatch() {
		nr.deleteAllInBatch();
	}

	@Override
	public NoticiaVO getOne(Integer id) {
		return nr.getOne(id);
	}

	@Override
	public <S extends NoticiaVO, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return nr.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return nr.count();
	}

	@Override
	public void deleteById(Integer id) {
		nr.deleteById(id);
	}

	@Override
	public NoticiaVO getById(Integer id) {
		return nr.getById(id);
	}

	@Override
	public void delete(NoticiaVO entity) {
		nr.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		nr.deleteAllById(ids);
	}

	@Override
	public NoticiaVO getReferenceById(Integer id) {
		return nr.getReferenceById(id);
	}

	@Override
	public void deleteAll(Iterable<? extends NoticiaVO> entities) {
		nr.deleteAll(entities);
	}

	@Override
	public <S extends NoticiaVO> List<S> findAll(Example<S> example) {
		return nr.findAll(example);
	}

	@Override
	public <S extends NoticiaVO> List<S> findAll(Example<S> example, Sort sort) {
		return nr.findAll(example, sort);
	}

	@Override
	public void deleteAll() {
		nr.deleteAll();
	}
	
	
}

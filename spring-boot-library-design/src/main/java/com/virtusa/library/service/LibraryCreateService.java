package com.virtusa.library.service;

import java.util.List;

import com.virtusa.library.entity.Library;

public interface LibraryCreateService {

	String addSingleLibrary(Library library);

	String addAllLibraries(List<Library> libraries);

	Library addLibrararywithSaveAndFlush(Library library);

}
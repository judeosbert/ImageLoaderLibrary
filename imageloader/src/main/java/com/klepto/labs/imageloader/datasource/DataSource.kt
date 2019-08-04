package com.klepto.labs.imageloader.datasource

import android.content.Context
import com.klepto.labs.imageloader.model.ResponseModel
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import org.koin.core.KoinComponent
import org.koin.core.inject
import org.koin.core.parameter.parametersOf

class DataSource(private val context: Context):KoinComponent {
    private val memoryDataSource:MemoryDataSource by inject()
    private val diskDataSource: DiskDataSource by inject {parametersOf(context)}
    private val networkDataSource: NetworkDataSource by inject()

    fun getDataFromMemory(key:String): Observable<ResponseModel> {return memoryDataSource.getData(key)}

    fun getDataFromDisk(key:String): Observable<ResponseModel> {return diskDataSource.getData(key)}

    fun getDataFromNetwork(key:String): Observable<ResponseModel>? {
        return networkDataSource.getData(key).doOnNext {
            it.bitmap?.let {bitmap->
                memoryDataSource.setData(key,bitmap)
                diskDataSource.setData(key,bitmap)
            }
        }


            }

    }
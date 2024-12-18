package com.ongo.signal.di

import android.content.Context
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideContext(@ApplicationContext context: Context): Context = context.applicationContext

    @Provides
    fun provideDataBaseInstance(): FirebaseDatabase = FirebaseDatabase.getInstance()

    @Provides
    fun provideDatabaseReference(db: FirebaseDatabase): DatabaseReference = db.reference
}
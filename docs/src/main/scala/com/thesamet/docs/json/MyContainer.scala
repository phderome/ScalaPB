// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.thesamet.docs.json

@SerialVersionUID(0L)
final case class MyContainer(
    myAny: _root_.scala.Option[com.google.protobuf.any.Any] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[MyContainer] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (myAny.isDefined) {
        val __value = myAny.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      myAny.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def getMyAny: com.google.protobuf.any.Any = myAny.getOrElse(com.google.protobuf.any.Any.defaultInstance)
    def clearMyAny: MyContainer = copy(myAny = _root_.scala.None)
    def withMyAny(__v: com.google.protobuf.any.Any): MyContainer = copy(myAny = Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => myAny.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => myAny.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.thesamet.docs.json.MyContainer
}

object MyContainer extends scalapb.GeneratedMessageCompanion[com.thesamet.docs.json.MyContainer] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.thesamet.docs.json.MyContainer] = this
  def merge(`_message__`: com.thesamet.docs.json.MyContainer, `_input__`: _root_.com.google.protobuf.CodedInputStream): com.thesamet.docs.json.MyContainer = {
    var __myAny = `_message__`.myAny
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __myAny = Option(_root_.scalapb.LiteParser.readMessage(_input__, __myAny.getOrElse(com.google.protobuf.any.Any.defaultInstance)))
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    com.thesamet.docs.json.MyContainer(
        myAny = __myAny,
        unknownFields = if (_unknownFields__ == null) _message__.unknownFields else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.thesamet.docs.json.MyContainer] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.thesamet.docs.json.MyContainer(
        myAny = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.any.Any]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = JsonProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = JsonProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.google.protobuf.any.Any
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.thesamet.docs.json.MyContainer(
    myAny = _root_.scala.None
  )
  implicit class MyContainerLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.thesamet.docs.json.MyContainer]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.thesamet.docs.json.MyContainer](_l) {
    def myAny: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.any.Any] = field(_.getMyAny)((c_, f_) => c_.copy(myAny = Option(f_)))
    def optionalMyAny: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.any.Any]] = field(_.myAny)((c_, f_) => c_.copy(myAny = f_))
  }
  final val MY_ANY_FIELD_NUMBER = 1
  def of(
    myAny: _root_.scala.Option[com.google.protobuf.any.Any]
  ): _root_.com.thesamet.docs.json.MyContainer = _root_.com.thesamet.docs.json.MyContainer(
    myAny
  )
}

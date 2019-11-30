// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.`type`

/** Enum type definition.
  *
  * @param name
  *   Enum type name.
  * @param enumvalue
  *   Enum value definitions.
  * @param options
  *   Protocol buffer options.
  * @param sourceContext
  *   The source context.
  * @param syntax
  *   The source syntax.
  */
@SerialVersionUID(0L)
final case class Enum(
    name: _root_.scala.Predef.String = "",
    enumvalue: _root_.scala.Seq[com.google.protobuf.`type`.EnumValue] = _root_.scala.Seq.empty,
    options: _root_.scala.Seq[com.google.protobuf.`type`.OptionProto] = _root_.scala.Seq.empty,
    sourceContext: _root_.scala.Option[com.google.protobuf.source_context.SourceContext] = _root_.scala.None,
    syntax: com.google.protobuf.`type`.Syntax = com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Enum] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = name
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      enumvalue.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      options.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      if (sourceContext.isDefined) {
        val __value = sourceContext.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      
      {
        val __value = syntax
        if (__value.value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(5, __value.value)
        }
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
      {
        val __v = name
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      enumvalue.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      options.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      sourceContext.foreach { __v =>
        val __m = __v
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = syntax
        if (__v.value != 0) {
          _output__.writeEnum(5, __v.value)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withName(__v: _root_.scala.Predef.String): Enum = copy(name = __v)
    def clearEnumvalue = copy(enumvalue = _root_.scala.Seq.empty)
    def addEnumvalue(__vs: com.google.protobuf.`type`.EnumValue*): Enum = addAllEnumvalue(__vs)
    def addAllEnumvalue(__vs: Iterable[com.google.protobuf.`type`.EnumValue]): Enum = copy(enumvalue = enumvalue ++ __vs)
    def withEnumvalue(__v: _root_.scala.Seq[com.google.protobuf.`type`.EnumValue]): Enum = copy(enumvalue = __v)
    def clearOptions = copy(options = _root_.scala.Seq.empty)
    def addOptions(__vs: com.google.protobuf.`type`.OptionProto*): Enum = addAllOptions(__vs)
    def addAllOptions(__vs: Iterable[com.google.protobuf.`type`.OptionProto]): Enum = copy(options = options ++ __vs)
    def withOptions(__v: _root_.scala.Seq[com.google.protobuf.`type`.OptionProto]): Enum = copy(options = __v)
    def getSourceContext: com.google.protobuf.source_context.SourceContext = sourceContext.getOrElse(com.google.protobuf.source_context.SourceContext.defaultInstance)
    def clearSourceContext: Enum = copy(sourceContext = _root_.scala.None)
    def withSourceContext(__v: com.google.protobuf.source_context.SourceContext): Enum = copy(sourceContext = Option(__v))
    def withSyntax(__v: com.google.protobuf.`type`.Syntax): Enum = copy(syntax = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => enumvalue
        case 3 => options
        case 4 => sourceContext.orNull
        case 5 => {
          val __t = syntax.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 2 => _root_.scalapb.descriptors.PRepeated(enumvalue.iterator.map(_.toPMessage).toVector)
        case 3 => _root_.scalapb.descriptors.PRepeated(options.iterator.map(_.toPMessage).toVector)
        case 4 => sourceContext.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => _root_.scalapb.descriptors.PEnum(syntax.scalaValueDescriptor)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.`type`.Enum
}

object Enum extends scalapb.GeneratedMessageCompanion[com.google.protobuf.`type`.Enum] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.`type`.Enum] = this
  def merge(`_message__`: com.google.protobuf.`type`.Enum, `_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.`type`.Enum = {
    var __name = `_message__`.name
    val __enumvalue = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.`type`.EnumValue] ++= `_message__`.enumvalue)
    val __options = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.`type`.OptionProto] ++= `_message__`.options)
    var __sourceContext = `_message__`.sourceContext
    var __syntax = `_message__`.syntax
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __name = _input__.readStringRequireUtf8()
        case 18 =>
          __enumvalue += _root_.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.`type`.EnumValue.defaultInstance)
        case 26 =>
          __options += _root_.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.`type`.OptionProto.defaultInstance)
        case 34 =>
          __sourceContext = Option(_root_.scalapb.LiteParser.readMessage(_input__, __sourceContext.getOrElse(com.google.protobuf.source_context.SourceContext.defaultInstance)))
        case 40 =>
          __syntax = com.google.protobuf.`type`.Syntax.fromValue(_input__.readEnum())
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    com.google.protobuf.`type`.Enum(
        name = __name,
        enumvalue = __enumvalue.result(),
        options = __options.result(),
        sourceContext = __sourceContext,
        syntax = __syntax,
        unknownFields = if (_unknownFields__ == null) _message__.unknownFields else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.`type`.Enum] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.`type`.Enum(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        enumvalue = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[com.google.protobuf.`type`.EnumValue]]).getOrElse(_root_.scala.Seq.empty),
        options = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[com.google.protobuf.`type`.OptionProto]]).getOrElse(_root_.scala.Seq.empty),
        sourceContext = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.source_context.SourceContext]]),
        syntax = com.google.protobuf.`type`.Syntax.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2.scalaValueDescriptor).number)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = TypeProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = TypeProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.protobuf.`type`.EnumValue
      case 3 => __out = com.google.protobuf.`type`.OptionProto
      case 4 => __out = com.google.protobuf.source_context.SourceContext
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 5 => com.google.protobuf.`type`.Syntax
    }
  }
  lazy val defaultInstance = com.google.protobuf.`type`.Enum(
    name = "",
    enumvalue = _root_.scala.Seq.empty,
    options = _root_.scala.Seq.empty,
    sourceContext = _root_.scala.None,
    syntax = com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2
  )
  implicit class EnumLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.`type`.Enum]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.`type`.Enum](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def enumvalue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.`type`.EnumValue]] = field(_.enumvalue)((c_, f_) => c_.copy(enumvalue = f_))
    def options: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.`type`.OptionProto]] = field(_.options)((c_, f_) => c_.copy(options = f_))
    def sourceContext: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.source_context.SourceContext] = field(_.getSourceContext)((c_, f_) => c_.copy(sourceContext = Option(f_)))
    def optionalSourceContext: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.source_context.SourceContext]] = field(_.sourceContext)((c_, f_) => c_.copy(sourceContext = f_))
    def syntax: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.`type`.Syntax] = field(_.syntax)((c_, f_) => c_.copy(syntax = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val ENUMVALUE_FIELD_NUMBER = 2
  final val OPTIONS_FIELD_NUMBER = 3
  final val SOURCE_CONTEXT_FIELD_NUMBER = 4
  final val SYNTAX_FIELD_NUMBER = 5
  def of(
    name: _root_.scala.Predef.String,
    enumvalue: _root_.scala.Seq[com.google.protobuf.`type`.EnumValue],
    options: _root_.scala.Seq[com.google.protobuf.`type`.OptionProto],
    sourceContext: _root_.scala.Option[com.google.protobuf.source_context.SourceContext],
    syntax: com.google.protobuf.`type`.Syntax,
    unknownFields: _root_.scalapb.UnknownFieldSet
  ): _root_.com.google.protobuf.`type`.Enum = _root_.com.google.protobuf.`type`.Enum(
    name,
    enumvalue,
    options,
    sourceContext,
    syntax,
    unknownFields
  )
}
